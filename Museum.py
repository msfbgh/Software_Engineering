class Room:
    def __init__(self, i, n=None, s=None, e=None, w=None, item=None, hv=False):
        self.item = item
        self.has_villain = hv
        self.north = n
        self.south = s
        self.east  = e
        self.west  = w
        self.room_id = i

    def __str__(self):
        return self.room_id

    @staticmethod
    def create_multiple(n):
        l = []
        for i in range(n):
            l.append(Room(str(i)))

        return l

class Game:
    def __init__(self):
        self.__current_room = self.create_map()
        self.__current_inventory = set()

    def create_map(self):
        room_list = Room.create_multiple(8)
        room_list[0].east = room_list[1]
        room_list[0].south = room_list[3]

        room_list[1].west = room_list[0]
        room_list[2].east = room_list[3]

        room_list[3].east  = room_list[5]
        room_list[3].west  = room_list[2]
        room_list[3].north = room_list[0]
        room_list[3].south = room_list[6]

        room_list[4].south = room_list[5]
        room_list[5].west  = room_list[3]
        room_list[5].north = room_list[4]

        room_list[6].north = room_list[3]
        room_list[6].east  = room_list[7]

        room_list[7].has_villain = True

        room_list[1].item = 'fuse'
        room_list[2].item = 'fire'
        room_list[3].item = 'sword'
        room_list[4].item = 'light'
        room_list[5].item = 'iron'
        room_list[6].item = 'oil'

        return room_list[0]

    def get_current_room(self):
        return self.__current_room

    def get_current_inventory(self):
        return self.__current_inventory

    def check_for_item(self):
        if self.__current_room.item is not None:
            self.__current_inventory.add(self.__current_room.item)

    def move_north(self):
        if self.__current_room.north is None:
            print("No way in north")
            return
        self.__current_room = self.__current_room.north
        self.check_for_item()

    def move_south(self):
        if self.__current_room.south is None:
            print("No way in south")
            return
        self.__current_room = self.__current_room.south
        self.check_for_item()

    def move_east(self):
        if self.__current_room.east is None:
            print("No way in east")
            return
        self.__current_room = self.__current_room.east
        self.check_for_item()

        if self.__current_room.has_villain:
            if len(self.__current_inventory) == 6:
                print("Victory!")
            else:
                print("Defeated. Not all items are picked! :(")
            exit()

    def move_west(self):
        if self.__current_room.west is None:
            print("No way in west")
            return
        self.__current_room = self.__current_room.west
        self.check_for_item()


if __name__ == "__main__":

    game = Game()

    # wining moves
    # game.move_east()
    # game.move_west()
    # game.move_south()
    # game.move_west()
    # game.move_east()
    # game.move_east()
    # game.move_north()
    # game.move_south()
    # game.move_west()
    # game.move_south()
    # game.move_east()

    print("Press 'Q' to quit.")

    while True:
        t = input("Enter your move(N/E/W/S) = ")
        if   t == 'N': game.move_north()
        elif t == 'E': game.move_east()
        elif t == 'W': game.move_west()
        elif t == 'S': game.move_south()
        elif t == 'Q': exit()
        else: print("Invalid input, try again!")

        print(game.get_current_room())
