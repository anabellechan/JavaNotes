##Singleton Pattern
#A singleton is a class that can only have a single instance of 
#it that's instantiated
class ApplicationState:
    instance=None

    def __init__(self):
        self.isLoggedIn=False
    
    @staticmethod
    def getAppState():
        if not ApplicationState.instance:
            ApplicationState.instance=ApplicationState()
        return ApplicationState.instance
    
appState1= ApplicationState.getAppState()
print(appState1.isLoggedIn) #False

appState2=ApplicationState.getAppState()
appState1.isLoggedIn=True

print(appState1.isLoggedIn) #True
print(appState2.isLoggedIn) #True
#Singleton is useful if multiple instances have to have 
#one single source of truth
