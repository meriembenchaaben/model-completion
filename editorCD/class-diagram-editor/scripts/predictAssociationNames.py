
import pandas as pd
import gensim
from gensim.models import Word2Vec
import re
import nltk
from nltk.corpus import wordnet
from nltk.corpus import wordnet as wn
import os
import sys

import openai
from dotenv import load_dotenv

load_dotenv()

openai.api_key = os.getenv("OPEN_AI")




def predictRelation(seq, couple):
    prompt ="predict association name: \n'[System,Author] => authors', '[Book,Chapter] => chaps', '[Chapter,Book] => itsbook'\n'[RoomStructure,RoomTypeHandling] => inherits from', '[Staff,SupportTicketReader] => inherits from', '[Staff,SupportTicketReader] => supportTicketReader'\n'[TA,Organisation] => organisation', '[Lecturer,Person] => inherits from', '[Organisation,CourseCoordinator] => courseCoordinator'\n'[And,Equatable] => right', '[Forall,Statement] => inherits from', '[Equality,Comparable] => right'\n'[Book,Person] => author', '[UoD,Person] => allPersons', '[Person,Loan] => loans'\n'[Country,Company] => companies', '[Neighborhood,NamedElement] => inherits from', '[Neighborhood,School] => schools'\n'[Chapter,Section] => sections', '[Selection,BodyElementContainer] => container', '[Schemadoc,Category] => category'\n'[employee , company] => worksIn, [manager, employee ] =>  supervises'\n'[person, Home] =>  owns','[car ,driver] => drives '\n'[personalCustomer, customer] => is', '[order,  customer] =>   places', '[employee, department] =>  worksIn'\n'[lion, meat] => eats', '[cat, milk] => drinks'\n"  +seq +", [" +  couple+ "] =>" ,



    response = openai.Completion.create(
        model="text-davinci-002",
        prompt=  prompt,
        temperature=0.7,
        max_tokens=1,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )
    res = response.choices[0].text
    #print( "[" +className +"],[ " + relatedClass+ "] =>" + res)

    return res
def predictTypeRelation(couples):


    response = openai.Completion.create(
        model="text-davinci-002",
        prompt="What type of associations these concepts have: \n\nstudent , person => inheritance\ncomputer, cpu => composition\nplane , passenger => no \nperson , address => association \naccount , saving => inheritance\nBank, Atm => composition\nnurse , bank => no \nprofessor, student => association \nprofessor , person => inheritance\ncontact , address => composition\ncircle , bank => no \naccount , checking => inheritance \ncustomer , account => association\nbook , paper => composition\nbook , doctor => no \nlion , meat => association \nlion , salad => no \nmammal , dog => inheritance\ncustomer, order => association\naddressBook, contact   => composition\nBank, Atm => composition\nmanager, employee =>  association\nplane, manager =>    no\n" + couples + '=> ',
        temperature=0.7,
        max_tokens=1,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )
    res = response.choices[0].text
    return res


# Press the green button in the gutter to run the script.
if __name__ == '__main__':

    seq="[Article,Category] => category', '[Section,BodyElement] => elements', '[TreeFormatter,Snippet] => snippet'"
    couple="BookVersion,AddressBook"
    results = predictRelation(seq,couple)
    type=predictTypeRelation(couple)
    print(results + ":" + type)


