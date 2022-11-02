import pandas as pd

import sys

import os
import openai
import wordninja

from dotenv import load_dotenv

load_dotenv()
openai.api_key = os.getenv("OPEN_AI")

df=pd.read_csv('/home/meriem/editorCD/class-diagram-editor/scripts/data/improvedAttributes.csv')
data_attributes=''

for i, row in df.iterrows():

  data_attributes= data_attributes+ '\n' + str(row['name']) +': '+str(row['attributes']).strip('{}')+ '.'

def intercept(args):
    ClassName=args[0]
    if len(args)>1:
        attributes= args[1]
    else :
        attributes=""
    return ClassName, attributes

def predictAttributes( className , args =""):
    prompt= "generate attributes for class names: \n " + data_attributes + '\n' + className +': [ '+ args + ','
    response = openai.Completion.create(
      engine="text-davinci-002",
      prompt=prompt,
      temperature=0.7,
      max_tokens=20,
      top_p=1,
      frequency_penalty=0,
      presence_penalty=0
    )
    res= response.choices[0].text

    return ( className + ': [ '+ args +',' + res)


def interceptResults(results):
    results=results.replace("\n", "")
    results=results.replace("'", "")

    try:
        attributesStr= results[results.find("[")+1:results.find("]")]

    except:
        attributesStr= results.split("[")[1]
        print('error')

    try:
        Attributes = attributesStr.split(',')

    except:
        Attributes = wordninja.split(attributesStr)


    while "'" in Attributes:
        Attributes.remove( "'")


    return Attributes




def predictAttributeType(attribute):


    response = openai.Completion.create(
        model="text-davinci-002",
        prompt="Address => String\nage => int\nname => String\nisCanceled => boolean\nsalary => int\nsold => float\nsurname => String\nbirthDate => Date\nisValidated => boolean\nstaffNumber => int\nwidth=> double\nphoneNumber => float\ncity => String\nstate => String\nzipCode => int" + attribute + "=>",
        temperature=0.7,
        max_tokens=1,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )
    res = response.choices[0].text
    return(res)



if __name__ == '__main__':
    args = sys.argv[1:]
    ClassName, attributes= intercept(args)

    if (sys.argv[3]=="Attribute"):

        res_ = interceptResults(predictAttributes(ClassName, attributes))

        for i in res_:
            if i != ' ':
                print(i)
    elif (sys.argv[3]=="Type"):

        Type = predictAttributeType(sys.argv[1])
        print(Type)
    else:
        print("no ! ")





