import pandas as pd
import re
import sys
import os
import openai
import wordninja

from dotenv import load_dotenv

load_dotenv()

openai.api_key = os.getenv("OPEN_AI")
df=pd.read_csv('/home/meriem/editorCD/class-diagram-editor/scripts/data/data.csv')

data=''
for i, row in df.iterrows():
  data= data+ '\n' + str(row['sequence']).strip('{}')+ '.'



def interceptList(EdConcepts):
    allCouples = [(a, b) for idx, a in enumerate(EdConcepts) for b in EdConcepts[idx + 1:]]

    return allCouples


def removeLetter(TheList):
    for ind, j in enumerate(TheList):

        if len(j) == 1:
            TheList.remove(j)
    return TheList


def removeDuplicated(TheList):
    for ind, j in enumerate(TheList):
        for indx, i in enumerate(TheList[ind + 1:]):
            if i.lower() == j.lower():
                TheList.remove(j)
    return TheList


def retrieveConcepts(res):
    S = re.sub(r'\W+', ' ', res)
    FirstSet = S.split(' ')
    NewConcepts = wordninja.split(S)
    NewConcepts.extend(FirstSet)
    NewConcepts = ' '.join(NewConcepts).split()
    concepts = set(NewConcepts)
    concepts = list(concepts)
    concepts = removeLetter(concepts)
    concepts = removeDuplicated(concepts)

    return concepts

def predictFinalList(designList_):
    Prompt = 'Continue the line: \n ' + data + '\n' + str(designList_) + ','

    response_ = openai.Completion.create(
        engine="text-davinci-002",
        prompt=Prompt,
        temperature=0.7,
        max_tokens=20,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )

    res_ = response_.choices[0].text
    concepts = retrieveConcepts(str(designList_) + ',' + res_)

    return concepts, res_

if __name__ == '__main__':


    args = sys.argv[1:]

    concepts, res_ = predictFinalList(args)
    for i in concepts:
        print(i)


