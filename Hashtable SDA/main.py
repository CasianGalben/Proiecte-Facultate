from PyQt5 import QtWidgets, QtGui, QtCore
from PyQt5.QtWidgets import *
from PyQt5.QtGui import *
from PyQt5.QtCore import *
from MainWindow import Ui_MainWindow
import sys


class HashTable:
    def __init__(self, size):
        self.size = size  #dimensiune
        self.table = [0]*self.size  #tablou

    def solveCollision(self):  #rezolva coliziunea prin liste simplu inlantuite 
       
        for i in range(self.size):
            self.table[i] = []

    def HashFunction(self, number): #functia de hash
        return int(number % self.size)

    def Add(self, data): #adauga in tablou (tablou de dispersie)
        self.table[self.HashFunction(data[0])] = data


data = [(0, "file"),
        (1, "text"),
        (2, "tex1"),
        (3, "photo"),
        (4, "db"),
        (5, "text2"),
        (6, "registry"),
        (7, "app"),
        (8, "browser_history"),
        (9, "bootable_data"),
        ]
cache = HashTable(4)


class MainWindow(QMainWindow):

    def __init__(self):
        QMainWindow.__init__(self)
        self.window = Ui_MainWindow()#creaza interfata
        self.window.setupUi(self)#aplica setari
        self.show()
        ######################
        self.initializeData()
        self.window.AddButton.clicked.connect(self.AddItem)#adauga funtie butoanelor
        self.window.ClearButton.clicked.connect(self.ClearList)#adauga funtie butoanelor

    def initializeData(self): #initializeaza datele din memoria main
        for i in range(0, len(data)):
            item = QListWidgetItem(str(data[i][0])+". "+str(data[i][1]))
            self.window.DataList.addItem(item)

    def AddItem(self):#adauga date din main in cash
        data_text = self.window.DataList.selectedItems()[0].text()
        data = (int(data_text.split(".")[0].strip()),
                data_text.split(".")[1].strip())
        if cache.table[cache.HashFunction(data[0])] != 0:
            aux = cache.table[cache.HashFunction(data[0])]
            self.window.Info.setText(
                data_text + " a inlocuit "+str(aux[0])+". "+str(aux[1])+" in cache deoarece are acelasi index")
        else:
            self.window.Info.setText(data_text + " a fost inserat in "+str(cache.HashFunction(data[0])))
        cache.Add(data)
        self.window.CacheList.clear()
        for i in range(0, len(cache.table)):
            if cache.table[i] == 0:
                item = QListWidgetItem("0")
                self.window.CacheList.addItem(item)
            else:
                item = QListWidgetItem(
                    str(cache.table[i][0])+"-"+str(cache.table[i][1]))
                self.window.CacheList.addItem(item)

    def ClearList(self):#curata cash
        self.window.CacheList.clear()

#lanseaza aplicatia
app = QApplication(sys.argv)
Main_Window = MainWindow()
sys.exit(app.exec_())
