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
def predictNextNode( context, starterPoint):

    response = openai.Completion.create(
        model="text-davinci-002",
        prompt="complete the  workflow : \nTicket Vending Machine: start  => request trip info => provide trip info => process trip info =>  payment request=> provide payment Info => process payment => pay with card / pay with cash=> if with card {authorize card payment} => end. \n\nOnline Shopping: start  => search item => found / not found => if found {view item =>decide buy  / decide not to buy => if buy { add to cart => proceed to payment / checkout }else {checkout}  } else {checkout} => end.\n\nProcess order: start  => recieve order =>  order accepted / order not accepted =>if order accepted {fill order => send invoice => accept payment => ship order => close} else {reject order => close order} }=> end.\n\nDocument management: start=>  Create document => review draft => approve document / not approve => if approved{make effective document=> } else {update document } => end.\n\n\nElectronic Prescriptions: start  => create electronic prescription => store electronic prescription => provide with prescription token => Request prescription item => retrieve electronic prescription => provide electronic prescription => dispense prespection => get prespection item => record prescription status => dispense notification => schedule endorsement => get schedule => end. \n\nResolve Software Issue: start => create ticket => reproduce issue => can't reproduce / reproduce => if {reproduce => identify issue => fix issue => verify fix => resolved/not resolved }=> end." + context + ":" + starterPoint + "=>",
        temperature=0.7,
        max_tokens=15,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )
    res= response.choices[0].text
    print(res)
    return ( res)


def interceptResults(Results):
    results=Results.split("=>")
    res=""
    print(results)
    type=""
    try:
        res=results[0]
        if("if" in res ) or ("/" in res):
            type="DecisionNode"
        else :
            type="Action"

    except :
        print("error")
    return(res,type)





if __name__ == '__main__':
    context= "Activation of Trial Product"
    starterPoint=" Create session => request activation  => provide activation key => process activation request"



    res_ = interceptResults(predictNextNode(context,starterPoint))

    print(res_)




