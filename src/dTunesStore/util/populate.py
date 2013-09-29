#!/usr/bin/python
#----------------------------------------------------------------------
#This is imported for generating random integers
from random import randint
import sys
#----------------------------------------------------------------------
# Checks to ensure the proper number of command line arguments
#  are entered.
#
# Expected input:
#	populate.py (string)FILE (string)RAND/NORM (int)NUMBER
#----------------------------------------------------------------------
if len(sys.argv) is not 4:
	print "ERROR: Invalid number of command line args, file not generated!"
	sys.exit(1)
#----------------------------------------------------------------------
fileName = sys.argv[1]
dataType = sys.argv[2]
numOut = int(sys.argv[3])

if fileName not in ("search", "data") or dataType not in ("random", "normal"):
	print "ERROR: Please enter a vaild type of data and output!"
	sys.exit(2)
#----------------------------------------------------------------------
print "Populating file!";
#----------------------------------------------------------------------
fileName = fileName + "File"
numOut+=1

#Opens output file for writing
text_file = open(fileName, "w")

if fileName == "searchFile":
	for i in range(1,numOut):
		if dataType == "random":
			b = str(randint(1, numOut))
		else:
			b = i

		#Randomly generates a search keyword
		a = randint(1,3)

		if a is 1:
			text_file.write("name" + str(b) + "\n") 
		if a is 2:
			text_file.write("album" + str(b)+ "\n")
		if a is 3:
			text_file.write("singer" + str(b)+ "\n")
#----------------------------------------------------------------------
else:
	for i in range(1,numOut):
		if dataType == "random":
			a = str(randint(1,numOut))
			b = str(randint(1, numOut))
			c = str(randint(1,numOut))
		else:
			a = i
			b = i
			c = i

		text_file.write("name" + str(a) + " " + "album" + str(b) + " " +
			"singer" + str(c) + " " + str(randint(1,5)) + "." + 
			str(randint(1,6)) + str(randint(0,9)) + "\n")
#----------------------------------------------------------------------
text_file.close();
#----------------------------------------------------------------------
print "Output file was created succesfully!"
#----------------------------------------------------------------------
print "\nExiting script"
#----------------------------------------------------------------------
