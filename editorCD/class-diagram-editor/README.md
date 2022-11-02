# class-diagram-editor
An editor to create class diagram.
  * Eclipse Modeling Tools, 
  * Eclipse Version: 2022-06 (4.24.0)
  * Sirius version: 7
          
To set up the environement for the prediction engine (written in python) 
  * Python: 3.8.10
  * `pip install -r requirements.txt` in the `/scripts` folder
  * openAi:   
    * Sign up and generate a token; https://openai.com/ 
    * create .env file and add the personal token OPEN_AI=""; 
        
Problem: What we have now generating classes could be done after clicking predict button (handler) and generating attributes is done by clicking twice in a class(service). 
Rollback exception is thrown when calling handler. 
 

Possible solutions to have good user experience: 
      
  * Put icons in top menu (such as predict button)
  * Right click in the canvas and finding the action in the menu (I think it's the best option but is it possible) 
    * => but we need to solve the problem of the handler. 
   * Using hotkeys (probably not possible in sirius)
        

        
        

        
 
        
