"# monty-hall-problem-simulation-java" 
This is a Monty Hall Problem Simulation for statistical check.

Problem Description:

If you're given 3 boxex. Only one of them has a prize. You have to choose one.
After you choose, the host reveals any other box which does not have the prize.
So, now, either your chosen box has the prize or the the remaining unrevealed box has the prize.
What would you do? Would you stay on your choice, or would you switch?

The strategy suggested here is that, you should always switch. Why?

When you choose a random box of 3, each box had 1/3 probability of having the prize. So, your chosen box had 1/3 probability and the other two combined had the 2/3 probability combined.
But When one of those boxes are revealed, 2/3 probability gets concentrated from 2 boxes to 3 boxes. So, chances of winning is always more in a switch.


|-----|    |-----|    |-----|
|     |    |     |    |     |
|     |    |     |    |     |
|     |    |     |    |     |
|-----|    |-----|    |-----|
  1/3        1/3        1/3
                   2/3



|-----|    |-----|    |-----|
|     |    |     |    |     |
|     |    |  x  |    |     |
|     |    |     |    |     |
|-----|    |-----|    |-----|
  1/3                   2/3

The program is designed to always choose the switch play to measure the win ratio.
Here, the program shows after over 10000 iterations that, after the switch play, your win ratio is near 66.66% or 2/3.
