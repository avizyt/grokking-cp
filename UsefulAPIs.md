Here's a **thorough, highly curated list of essential Java APIs** for **competitive programming**, battle-tested in platforms like Codeforces, Leetcode, AtCoder, and ICPC. Each item includes usage context and why it's effective.

---

## ✅ 1. **java.util package (most critical)**

### 🔸 `Arrays`
- `Arrays.sort(array)` – Sorting primitives
- `Arrays.fill(array, val)` – Fast initialization
- `Arrays.binarySearch(array, key)` – Binary search on sorted array
- `Arrays.copyOf(array, newLength)` – Resize array
- `Arrays.equals(a, b)` – Compare full arrays
- `Arrays.toString(arr)` – Debug print

✅ **Why**: Fast built-in sorting and search; minimizes boilerplate.

---

### 🔸 `Collections`
- `Collections.sort(list)` – Generic sort
- `Collections.reverse(list)` – Reverse list
- `Collections.max(list), min(list)` – Useful for bounds
- `Collections.frequency(list, obj)` – Count frequency (slow for large inputs)
- `Collections.swap(list, i, j)` – Swap in-place
- `Collections.binarySearch(list, key)` – On sorted lists

✅ **Why**: Utility methods for `List<T>` handling and mutations.

---

### 🔸 `List`, `ArrayList`, `LinkedList`
- `new ArrayList<>()`, `add(val)`, `get(i)`, `set(i, val)`
- `subList(i, j)` – Important for partial processing
- `remove(index)`, `contains(x)` (beware: O(n))

✅ **Why**: Dynamic-sized arrays, useful for DP tables, adjacency lists.

---

### 🔸 `HashMap`, `TreeMap`, `LinkedHashMap`
- `map.put(key, val)`, `map.get(key)`, `map.containsKey(key)`
- `TreeMap`: Sorted key-value store
- `map.entrySet()` – For iteration
- `map.computeIfAbsent(k, v -> new ...)` – Condensed init

✅ **Why**: Count frequencies, sliding window, interval trees (with TreeMap).

---

### 🔸 `HashSet`, `TreeSet`
- `add(val)`, `contains(val)`, `remove(val)`
- `TreeSet`: Sorted set with ceiling, floor, higher, lower

✅ **Why**: Duplicate checking, fast lookup, sliding window unique elements.

---

### 🔸 `PriorityQueue` (Min/Max Heap)
- `new PriorityQueue<>()` – Min-heap by default
- `new PriorityQueue<>(Collections.reverseOrder())` – Max-heap
- `add()`, `poll()`, `peek()`

✅ **Why**: Dijkstra, greedy algorithms, running median, k-largest/smallest.

---

## ✅ 2. **java.lang.Math**

- `Math.max/min(a, b)`
- `Math.abs(x)`, `Math.pow(a, b)`
- `Math.sqrt(x)`, `Math.cbrt(x)`
- `Math.floorDiv(a, b)` – Correct integer floor division
- `Math.ceil()`, `round()`, `log()`

✅ **Why**: Core math utilities for geometry, simulations, log-based algo.

---

## ✅ 3. **java.util.Deque (Double-ended Queue)**

- `ArrayDeque` → much faster than `LinkedList` for CP
- Methods:
  - `addFirst()`, `addLast()`
  - `removeFirst()`, `removeLast()`
  - `peekFirst()`, `peekLast()`

✅ **Why**: Used in sliding window max/min (Monotonic Queue), BFS/DFS (0-1 BFS).

---

## ✅ 4. **java.util.StringTokenizer / String.split / StringBuilder**

### 🔸 `StringTokenizer` (faster than split for space-separated input)
```java
StringTokenizer st = new StringTokenizer(br.readLine());
int a = Integer.parseInt(st.nextToken());
```

### 🔸 `String.split(regex)`
```java
String[] parts = line.split(" ");
```

### 🔸 `StringBuilder` (for fast concatenation)
```java
StringBuilder sb = new StringBuilder();
sb.append(...); sb.toString();
```

✅ **Why**: Efficient I/O, fast string handling, avoids TLE.

---

## ✅ 5. **java.io for Fast I/O**

### 🔸 `BufferedReader` + `PrintWriter` (Standard for CP)
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter out = new PrintWriter(System.out);
```

✅ **Why**: Much faster than `Scanner` and `System.out.println` — avoids TLE.

---

## ✅ 6. **java.util.BitSet**

- Efficient for compact boolean arrays / sieve of Eratosthenes
```java
BitSet bs = new BitSet(size);
bs.set(i), bs.get(i)
```

✅ **Why**: Low memory usage and fast bit operations.

---

## ✅ 7. **java.math.BigInteger**

- Used for **modular arithmetic**, **large number operations**
- Methods:
  - `add`, `subtract`, `multiply`, `divide`
  - `mod`, `modInverse`, `modPow`
  - `gcd`, `isProbablePrime(k)`

✅ **Why**: Cryptography, combinatorics, modular exponentiation (large `n`, `mod`).

---

## ✅ 8. **java.util.stream.Streams**

(Not always used in CP but great for filtering/mapping/one-liners)
```java
int[] arr = Arrays.stream(inputLine.split(" "))
                  .mapToInt(Integer::parseInt)
                  .toArray();
```

✅ **Why**: Clean parsing and transformations.

---

## ✅ 9. **java.util.Comparator**

- Custom sorting:
```java
Arrays.sort(arr, (a, b) -> a[0] - b[0]); // 2D array sort by first column
```

✅ **Why**: Needed for greedy problems, interval scheduling, custom orderings.

---

## 🧠 Pro CP Tips in Java:

- Always use `BufferedReader` + `StringTokenizer` for input.
- Reuse data structures: reset instead of re-instantiating.
- Use `TreeMap` / `TreeSet` when ordered data is required.
- Use `Deque` instead of `Queue`/`Stack` for flexibility and speed.
- Use `PriorityQueue` when greedily fetching min/max is needed.

---

Would you like a printable cheat sheet with usage examples for each of these APIs?