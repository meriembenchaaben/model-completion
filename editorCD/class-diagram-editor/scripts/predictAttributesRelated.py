import pandas as pd

import sys

import os
import openai
import wordninja

from dotenv import load_dotenv

load_dotenv()
openai.api_key = os.getenv("OPEN_AI")


#from eclipse : package, string to concat
def intercept(args):
    print(args)
    package =args[0]
    if len(args)>1:
        attributes= args[1]
    else :
        attributes=""
    return package ,


#otherConcepts= 'person:[id, name, lastName] ,member:[id, name, lastName],husband:[]'
#concept=wife : what I actually want to populate
#attributesConcept= if the target concept already have some attributes.
def predictAttributes( packageName , otherConcepts, concept , attributesConcept='[]'):

    response = openai.Completion.create(
      model="text-davinci-002",
      prompt="add attributes for each class in this class diagram: \npackage company: \nemployee : [id, name, lastName, occupation]; \nmanager: [id, name, department]; \ncompany:[name, holding]\n=> \nemployee : [id, name, lastName, occupation, department ,experience,revenue ];\nmanager: [id, name, department, team,revenue];\ncompany: [name, holding,address,website]\n\npackage bank: \nbank:[ bankName,manager];\naccount:[ id, balance, accountType];\ncustomer:[id, name, surname, age, email];\n=>bank:[ bankName,manager];\naccount:[ id, balance, accountType, accountNumber, accountHolder, dateOpening ];\ncustomer:[id, name, surname, age, email, gender, addres, phoneNumber];\n\n\npackage airport: \nplane:[id, manufacturer, fuel, capacity, numOfEngine];\ntrip:[ flightNo, from, to:, departureDate];\npassenger:[];\nairport:[];\n=> \n\n\n\n\n\n\npackage airport: \nplane:[id, manufacturer, fuel, capacity, numOfEngine];\ntrip:[ flightNo, from, to:, departureDate, arrivalDate, flightStatus ];\npassenger:[id, name, surname, age, gender, passportNo];\nairport:[id, name, location];\n\npackage article: \nconference:[]; \njournal:[];\narticle:[];\n=>\n\n\npackage article: \nconference:[id, name, date, location]; \njournal:[id, name, date];\narticle:[id, title, author, date, type];\n\npackage " + packageName + ': \n'
             + otherConcepts + ','+concept +':[] ;'+"=>",
      temperature=0.7,
      max_tokens=256,
      top_p=1,
      frequency_penalty=0,
      presence_penalty=0
    )
    res= response.choices[0].text
    print(res)
    return ( res)


def interceptResults(Results):
    results=Results.split("\n")
    dictRes={}
    try:
        for idx,i in enumerate(results):
            if(idx !=0):
                concept=i.split(":")[0]
                attributesStr= i[i.find("[")+1:i.find("]")]
                #attributes are in str and not list should be parsed in eclipse
                dictRes[concept]=[attributesStr]
        print(dictRes)
    except:
        print('error')
        print(Results)
    return dictRes




if __name__ == '__main__':
    args = sys.argv[1:]
    print('what recieved from eclipse : ' + str(args ))
    attributes= intercept(args)
    concepts=args[1]
    concept=args[0]
    #package='Family'
    #concepts='person:[],member:[],husband:[],'
    #concept='wife:[]'
    package=args[2]
    res_ = interceptResults(predictAttributes(package, concepts,concept))

    print(res_)




