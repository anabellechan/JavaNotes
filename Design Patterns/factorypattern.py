### Factory Pattern
class Burger:
    def __init__(self,ingredients):
        self.ingredients=ingredients
    
    def print(self):
        print(self.ingredients)

class BurgerFactory:
    def createCheeseBurger(self):
        ingredients=["bun", "cheese", "beef-patty"]
        return Burger(ingredients)
    
    def createDeluxeCheeseBurger(self):
        ingredients=["bun", "cheese","tomato","lettue", "beef-patty"]
        return Burger(ingredients)
    
    def createVeganBurger(self):
        ingredients=["bun", "cheese", "veggie-patty","special-sauce"]
        return Burger(ingredients)

burgerFactory=BurgerFactory()
burgerFactory.createCheeseBurger().print()
burgerFactory.createDeluxeCheeseBurger().print()
burgerFactory.createVeganBurger().print()