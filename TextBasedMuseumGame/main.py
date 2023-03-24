#Marian Farah

print('Welcome to the Dragon Text Adventure Game.')
print('Type the instruction: North, South, East, or West. Type Exit to quit.')

rooms = {
    'Great Hall': {'south': 'Bedroom'},
    'Bedroom': {'north': 'Great Hall', 'east': 'Cellar'},
    'Cellar': {'west': 'Bedroom'}
}
moveCommands = {'north', 'east', 'south', 'west', 'exit'}

def location(currentRoom):
    print('You are in the {}.'.format(currentRoom))

def direction(presentRoom, move, place):
    global currentRoom

    if move == moveCommands:

        if place in rooms[presentRoom]:
            currentRoom = rooms[presentRoom][place]
            print('You are in room {}.'.format(place))
        else:
            print('There is nothing in that direction {}.'.format(place))
    else:
        print('Enter a different direction.')

currentRoom = 'Great Hall'

while True:

    location(currentRoom)
    player = input('Enter a move: North, South, East, or West. Type Exit to quit.')
    inputMove = player.lower().split()
    if 'exit' not in inputMove:

        if len(inputMove) != 2:
            print('Enter a different direction.')
        else:
            action = inputMove[0]
            actionSubject = inputMove[1]
            direction(currentRoom, action, actionSubject)
    else:
        print('Thanks for playing!')
        break