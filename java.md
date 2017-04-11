# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-4. Complete the following tasks: (~180 mins)

- [Seconds](seconds/Seconds.java)
- [Count A-s](countas/CountAs.java)
- [Pirates](pirates/Pirates.java)
- [Box](box/Box.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

### How can you generate a random number? [2p]
#### Your answer: We can crete with two function. Once we have a bulit in
		class for this: java.util.Random class which has a method. If
		we want to create we call the class as
		 Random random = new Random();
		and after we initialize a new number as random number:
		int x = random.nextInt(100);
		where the 100 means the max value of the random number.
		Second option where we initialize a new integer and give it a
		Math.random method as we cast it to (int) like:
		int x = (int) (Math.random() * 100)
		where we multiply the number with 100, becasue the Math.random
		generate the number between 0 and 1, so we multiply to have
		result between 0 and 100.
