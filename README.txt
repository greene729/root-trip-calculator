Alexander Greene
Root Trip Calculator (Interview Kata)

To solve the prompt of creating a program that would read input a text file and use that input to keep track of drivers and their trips, I decided that the best course of action would be to create a console app in Java.

I have created the Driver and Trip object classes to encapsulate the data relative to those bits of input, a Reader object to parse the data and feed it into the relevant objects, and an App class to deal with user-facing I/O.

I used Test Driven Design to create out my classes rather than creating the classes and regression testing them, because the rhythm of TDD helps me to think about coding more critically, and ensures that my code functions properly at any step of the process.

The Driver class is constructed with a name variable each time a file is uploaded with a new driver and contains a list of Trips that have been entered using that name. Users will be able to look up the total number of miles driven and the average speed driven.

The Trip class is constructed with a start time, an end time, and a distance. A trip will pull this information from the input and can use it to calculate average speed for that trip.