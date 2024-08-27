class YoutubeChannel:
    def __init__(self,name):
        self.name=name
        self.subscribers=[]
    
    def subscribe(self,sub):
        self.subscribers.append(sub)
    
    def notify(self,event):
        for sub in self.subscribers:
            sub.sendNotification(self.name,event)

from abc import ABC, abstractmethod

class YoutubeSubscriber(ABC):
    @abstractmethod
    def sendNotification(self,event):
        pass

class YoutubeUser(YoutubeSubscriber):
    def __init__(self,name):
        self.name=name

    def sendNotification(self, channel, event):
        print(f"User" {self.name} received notifications from {channel}: {event})

