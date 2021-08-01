
from PyQt5 import QtCore, QtGui, QtWidgets


class Ui_MainWindow(object):
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(900, 500)
        MainWindow.setMinimumSize(QtCore.QSize(900, 500))
        MainWindow.setMaximumSize(QtCore.QSize(900, 504))
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(10)
        MainWindow.setFont(font)
        self.centralwidget = QtWidgets.QWidget(MainWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.frame = QtWidgets.QFrame(self.centralwidget)
        self.frame.setGeometry(QtCore.QRect(-1, -1, 900, 500))
        self.frame.setStyleSheet(".QFrame{\n"
                                 "background-color:rgb(74, 128, 255)\n"
                                 "}")
        self.frame.setFrameShape(QtWidgets.QFrame.StyledPanel)
        self.frame.setFrameShadow(QtWidgets.QFrame.Raised)
        self.frame.setObjectName("frame")
        self.Title = QtWidgets.QLabel(self.frame)
        self.Title.setGeometry(QtCore.QRect(0, 9, 891, 41))
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(18)
        self.Title.setFont(font)
        self.Title.setFrameShape(QtWidgets.QFrame.NoFrame)
        self.Title.setAlignment(QtCore.Qt.AlignCenter)
        self.Title.setObjectName("Title")
        self.DataList = QtWidgets.QListWidget(self.frame)
        self.DataList.setGeometry(QtCore.QRect(20, 110, 321, 371))
        font = QtGui.QFont()
        font.setPointSize(12)
        self.DataList.setFont(font)
        self.DataList.setSizeAdjustPolicy(
            QtWidgets.QAbstractScrollArea.AdjustToContents)
        self.DataList.setObjectName("DataList")
        self.CacheList = QtWidgets.QListWidget(self.frame)
        self.CacheList.setGeometry(QtCore.QRect(560, 110, 321, 281))
        font = QtGui.QFont()
        font.setFamily("Segoe UI")
        font.setPointSize(12)
        self.CacheList.setFont(font)
        self.CacheList.setSizeAdjustPolicy(
            QtWidgets.QAbstractScrollArea.AdjustToContents)
        self.CacheList.setObjectName("CacheList")
        self.AddButton = QtWidgets.QPushButton(self.frame)
        self.AddButton.setGeometry(QtCore.QRect(380, 140, 131, 41))
        sizePolicy = QtWidgets.QSizePolicy(
            QtWidgets.QSizePolicy.Minimum, QtWidgets.QSizePolicy.Fixed)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(
            self.AddButton.sizePolicy().hasHeightForWidth())
        self.AddButton.setSizePolicy(sizePolicy)
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(14)
        font.setBold(False)
        font.setWeight(50)
        self.AddButton.setFont(font)
        self.AddButton.setStyleSheet("QPushButton{\n"
                                     "background-color:rgb(203, 203, 203);\n"
                                     "border:none;\n"
                                     "color:rgb(0, 0, 0);\n"
                                     "padding:5px;\n"
                                     "text-align: center;\n"
                                     "border-radius:15px;\n"
                                     "border-color:rgb(255, 255, 255)\n"
                                     "}\n"
                                     "QPushButton:hover{\n"
                                     "background-color:rgb(158, 158, 158);\n"
                                     "}\n"
                                     "QPushButton:pressed{\n"
                                     "background-color:rgb(158, 158, 158);\n"
                                     "}")
        self.AddButton.setObjectName("AddButton")
        self.ClearButton = QtWidgets.QPushButton(self.frame)
        self.ClearButton.setGeometry(QtCore.QRect(380, 190, 131, 41))
        sizePolicy = QtWidgets.QSizePolicy(
            QtWidgets.QSizePolicy.Minimum, QtWidgets.QSizePolicy.Fixed)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(
            self.ClearButton.sizePolicy().hasHeightForWidth())
        self.ClearButton.setSizePolicy(sizePolicy)
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(14)
        font.setBold(False)
        font.setWeight(50)
        self.ClearButton.setFont(font)
        self.ClearButton.setStyleSheet("QPushButton{\n"
                                       "background-color:rgb(203, 203, 203);\n"
                                       "border:none;\n"
                                       "color:rgb(0, 0, 0);\n"
                                       "padding:5px;\n"
                                       "text-align: center;\n"
                                       "border-radius:15px;\n"
                                       "border-color:rgb(255, 255, 255)\n"
                                       "}\n"
                                       "QPushButton:hover{\n"
                                       "background-color:rgb(158, 158, 158);\n"
                                       "}\n"
                                       "QPushButton:pressed{\n"
                                       "background-color:rgb(158, 158, 158);\n"
                                       "}")
        self.ClearButton.setObjectName("ClearButton")
        self.MainMemoryLabel = QtWidgets.QLabel(self.frame)
        self.MainMemoryLabel.setGeometry(QtCore.QRect(20, 50, 851, 41))
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(18)
        self.MainMemoryLabel.setFont(font)
        self.MainMemoryLabel.setFrameShape(QtWidgets.QFrame.NoFrame)
        self.MainMemoryLabel.setAlignment(
            QtCore.Qt.AlignLeading | QtCore.Qt.AlignLeft | QtCore.Qt.AlignVCenter)
        self.MainMemoryLabel.setObjectName("MainMemoryLabel")
        self.CacheMemoryLabel = QtWidgets.QLabel(self.frame)
        self.CacheMemoryLabel.setGeometry(QtCore.QRect(20, 50, 851, 41))
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(18)
        self.CacheMemoryLabel.setFont(font)
        self.CacheMemoryLabel.setFrameShape(QtWidgets.QFrame.NoFrame)
        self.CacheMemoryLabel.setAlignment(
            QtCore.Qt.AlignRight | QtCore.Qt.AlignTrailing | QtCore.Qt.AlignVCenter)
        self.CacheMemoryLabel.setObjectName("CacheMemoryLabel")
        self.Info = QtWidgets.QTextEdit(self.frame)
        self.Info.setGeometry(QtCore.QRect(360, 400, 521, 87))
        font = QtGui.QFont()
        font.setFamily("Gill Sans MT Condensed")
        font.setPointSize(15)
        self.Info.setFont(font)
        self.Info.setStyleSheet(".QTextEdit{\n"
                                "background-color:rgb(74, 128, 255)\n"
                                "}")
        self.Info.setObjectName("Info")
        MainWindow.setCentralWidget(self.centralwidget)

        self.retranslateUi(MainWindow)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)

    def retranslateUi(self, MainWindow):
        MainWindow.setWindowIcon(QtGui.QIcon('icon.png'))
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate(
            "Hash CPU Cache", "Hash CPU Cache"))
        self.Title.setText(_translate("MainWindow", "Hash CPU Cache"))
        self.AddButton.setText(_translate("MainWindow", "Adauga in cache"))
        self.ClearButton.setText(_translate("MainWindow", "Curata cache"))
        self.MainMemoryLabel.setText(_translate(
            "MainWindow", "<html><head/><body><p>Main Memory</p><p><br/></p></body></html>"))
        self.CacheMemoryLabel.setText(_translate(
            "MainWindow", "<html><head/><body><p>Cache Memory</p></body></html>"))
        self.Info.setHtml(_translate("MainWindow", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"
                                     "<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"
                                     "p, li { white-space: pre-wrap; }\n"
                                     "</style></head><body style=\" font-family:\'Gill Sans MT Condensed\'; font-size:10pt; font-weight:400; font-style:normal;\">\n"
                                     "<p style=\"-qt-paragraph-type:empty; margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><br /></p></body></html>"))
