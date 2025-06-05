# SmallWeatherStationSystemDeque

This project simulates a basic weather monitoring system that tracks the maximum temperature in the last k readings using the Deque data structure in Java. It efficiently manages and retrieves the maximum temperature from a sliding window of temperature readings.

## Code Summary

The program uses a Deque<Integer> to store indices of temperature readings in a way that the maximum temperature in the last k readings can be accessed in constant time. It performs the following operations:

i) Add Temperature: Adds a new temperature reading while maintaining the order and size of the window. It removes:

- All lower or equal temperatures from the back (to keep max at the front).

- Outdated indices from the front (outside the current window of size k).

ii) Get Max Temperature: Prints the maximum temperature in the current sliding window.

## Sample Output

```
Max temperature is: 60
Max temperature is: 65
```

## Key Points

i) Uses Java’s ArrayDeque to maintain a monotonic decreasing deque for fast max retrieval.

ii) Implements a sliding window maximum approach often used in real-time monitoring and analytics.

iii) Efficient: Each temperature is added and removed at most once → amortized O(1) per operation.

## Developed By: 

Milan P Samuel
