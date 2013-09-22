#!/usr/bin/python
#----------------------------------------------------------------------
#This is imported for generating random integers
from random import randint

print "Populating dataFile!";

#Opens "dataFile" for writing
text_file = open("dataFile", "w")

#----------------------------------------------------------------------

#Generates 200 song strings and writes them the the file "dataFile"
for i in range(1,201):
	text_file.write("name" + str(randint(1,200)) + " " + "album" + str(randint(1,200)) + " "
	+ "singer" + str(randint(1,50)) + " " + str(randint(2,3)) + "." + str(randint(0,5)) + str(randint(0,9))  + "\n")

#----------------------------------------------------------------------
print "File \"dataFile\" was created succesfully!"

text_file.close();

print "\nExiting script"
#----------------------------------------------------------------------
