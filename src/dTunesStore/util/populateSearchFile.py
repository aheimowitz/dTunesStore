#!/usr/bin/python
#----------------------------------------------------------------------
#This is imported for generating random integers
from random import randint

print "Populating seachFile!";

#Opens "searchFile" for writing
text_file = open("searchFile", "w")

#----------------------------------------------------------------------
#Generates 50 search strings and places them in file "searchFile"
for i in range(1,51):
	#Randomly generates a search keyword (or no keyword)
	a = randint(1,4)
	
	if a is 1:
		text_file.write("name" + str(randint(1,200)) + "\n") 
	if a is 2:
		text_file.write("album" + str(randint(1,200))+ "\n")
	if a is 3:
		text_file.write("singer" + str(randint(1,50))+ "\n")

#----------------------------------------------------------------------
print "File \"searchFile\" was created succesfully!"

text_file.close();

print "\nExiting script"
#----------------------------------------------------------------------
