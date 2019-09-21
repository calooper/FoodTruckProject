### Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

###Overview

This program is designed to have a user rate a selected number of food trucks
and display results of the highest rated truck, the average rating, and the
full list of trucks.

###Technologies Used

This program begins in a class titled "FoodTruckApp".

1. In the main method, a method titled "launch" is called where the user is
prompted to enter the number of trucks he/she wishes to rate.

The user is then asked to:

2. enter the name of the first truck

3. enter the type of food offered

4. enter the rating they wish to give the food trucks

5. This is repeated each time for the number of trucks the user entered in step
1.However, if the user types "quit" at any time during the 2nd step - which
asks for the name of the truck - the user will break out of the loop and the
number of truck objects created will only be equal to the number of trucks
they rated. Each truck object is stored into an object array.

----If the user decides to "quit" the program during the first input (meaning there
was never an object truck created) the program ends and a goodbye message is
displayed----

After step 5 is completed, and the loop has ended, another method is called
which displays a menu that was constructed using a switch statement. The switch
statement loops until the users ends the program by selecting option 4.   

If the user selects option 1 - choice to see the average truck rating - then
a method is called that passes the truck array and uses a for loop to parse out
each rating using a getter and returns the sum. The sum is then divided by the
number of truck objects used to return the average rating.

If the user selects option 2 - choice to see highest rated truck -   a
method is called that parses the highest rating, returns that array number as
an integer, and then uses that number to select the correct array and display
its contents by using a toString method.

If the user selects option 3 - choice to see the list of trucks -  a method is
called that that uses a getter to concat the names of all the trucks. The
method concats each name using a comma, and separates the last two using
only an " & " sign. If a user only inputs two trucks, it will display as
"truck name & truck name " - without the use of any commas.

If the user selects option 4 - the exit choice - the program displays a
goodbye message and ends.

If the user selects a number outside the range of 1 - 4, a message displays
informing the user that the number selected is not a valid option. The loop
then continues and displays the menu again

###Lessons Learned

This program was a great opportunity to really take the time to
conceptualize how I was going to begin the overall design. The truck ID,
which isn't inputed by the user, but is automatically generated in the
constructor, took a little but of time to figure out. Creating an array that
stored each object also took a little bit of time, but was great practice.

One issue I had at the end was that my for-loop counter that I used when parsing
the array, used the number that the user originally inputed for the number of
trucks to rate. This wasn't an issue unless the user chose a number of trucks
to enter and cut it short by typing quit and moving to the next menu screen.  
To solve this, I had to set a variable equal to the counter in the for loop
that was creating each truck in the array. The number stopped at the point
the user decided to not enter any more ratings. I had to pass that as an
argument in the other methods, which solved any "out of bounds" issues.
