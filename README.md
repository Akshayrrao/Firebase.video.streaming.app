# Firebase.vedio.sreaming.app
Firebase video Streaming app with user login,register,feedback system.

# MyChatBot 

MyChatBot is an android chatbot application using Dialogflow agent.

A chatbot is a piece of software that conducts a conversation via auditory or textual methods. Our chatbot application will be able to conduct simple conversation with the user. We are using Dialogflow to create an AI agent which can respond to the user in the application.

Dialogflow is a Google-owned developer of human – computer interaction technologies based on natural language conversations. We can create AI agents to which can respond to user for the queries of user. Using Dialogflow we can add some contexts to make the agent reply with the information provided by developers. We can also have some extra Intents in Dialogflow to do the same.

By using the Dialogflow API we can access the Dialogflow agent through our android application and get the responses. This application also has speech to text support in the chatbot. Using this speech to text conversion user can have conversations with the chatbot using speech.

## We have following activities in our application.

  - Registration Activity
  - Login Activity
  - Video Streaming
  - Feedback Activity
  - About Activity


## Execution

- We need to create a dialogflow agent and then connect it to our chatbot application by using the key. Replace key in MainActivity.java with your agent key to interact with your own agent.
- The Login and Registration process is by connecting to firebase.
- The feedback is stored in firebase realtime database.

## Output Screenshots

<table>
  <tr>
    <td>Welcome Screen</td>
     <td>Registration Page</td>
     <td>Login Page</td>
  </tr>
  <tr>
    <td><img src="https://github.com/akashjain04/MyChatBot/blob/master/Output%20Screenshots/welcome.png?raw=true" width=270 height=480></td>
    <td><img src="https://github.com/akashjain04/MyChatBot/blob/master/Output%20Screenshots/registration.png?raw=true" width=270 height=480></td>
    <td><img src="https://github.com/akashjain04/MyChatBot/blob/master/Output%20Screenshots/Login.png?raw=true" width=270 height=480></td>
  </tr>
  <tr>
        <td>Chatbot layout</td>
     <td>feedback Page</td>
     <td> Options menu</td>
  </tr>
  <tr>
    <td><img src="https://github.com/akashjain04/MyChatBot/blob/master/Output%20Screenshots/Chatbot.png?raw=true" width=270 height=480></td>
    <td><img src="https://github.com/akashjain04/MyChatBot/blob/master/Output%20Screenshots/feedback.png?raw=true" width=270 height=480></td>
    <td><img src="https://github.com/akashjain04/MyChatBot/blob/master/Output%20Screenshots/menu.png?raw=true" width=270 height=480></td>
  </tr>
 </table>
