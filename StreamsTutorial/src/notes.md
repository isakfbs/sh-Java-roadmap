# Strams Tutorial

## Stream Source

- Streams can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file...

## Stream operations are either intermediate or terminal.

- *Intermediate operations* such a filter, map or sort return a stream so we can chain multiple intermediate operations.
- *Terminal operations* such as forEach, collect or reduce are either void or return a non-stream result.

Zero or more intermediate operations are allowed.

Order matters for large datasets: *filter first*, the sort or map.

For very large datasets use ParallelStream to enable multiple threads.

Intermediate operations include:

- anyMatch()          
- distinct()          
- filter()            
- findFirst()
- flatmap()
- map()
- skip()
- sorted()

One terminal operations is allowed

- forEach applies the same function to each element.
- collect saves the elements into a collection.
- other options *reduce* the stream to a single summary element.
  - count()
  - max()
  - min()
  - reduce()
  - summaryStatistics()



