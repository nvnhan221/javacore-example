# Stream API
Hỗ trợ từ java version 8

## Stream API là gì?
- Stream đại diện cho một chuỗi các objects từ một nguồn dữ liệu.
- Cung cấp 1 cách tiếp cận functional programming, để xử lý dữ liệu một cách hiệu quả và ngắn gọn.
## Đặc điểm
- Sequence of elements: tổng hợp và xử lý một tập các phần từ 1 cách tuần tự hoặc song song.
- Source: sử dụng Collections, Arrays, hoặc I/O resources nhu là input đầu vào.
- Aggregate operations: hỗ trợ các thao tác tổng hợp như filter, map, limit, reduce, find, match, ...
- Pipelining
- Automatic iterations

## Streams trong Java
Với java 8, Collection interface cung cấp 2 phương thức để tạo một Stream.
- **`stream()`** - trả về một stream và các thao tác sẽ được xử lý 1 cách tuần tự.
- **`parallelStream`** - trả về một stream và các thao tác sẽ được xử lý song song.

## forEach
```java

```
## map: transforms each element using a function
## filter: filters elements based on a condition
## limit
## sorted(): sorts elements in natural or custom order.
## Parallel Processing
Dùng parallelStream để tận dụng nhiều CPU, giú xử lý nhanh hơn với dữ liệu lớn.
Ưu điểm: tận dụng nhiều CPU.
Nhược được: không đảm bảo thứ tự, có thể gây lỗi race condition.
```java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.parallelStream()
            .mapToInt(n -> n * 2)
            .sum();

        System.out.println(sum);
    }
}
```

## Key Features of the Stream API
- Functional Style: supports functional programming with lambda expressions.
- Lazy Evaluation: operations are executed only when a terminal operation is invoked.
- Parallel Streams: enables efficient processing using multiple threads.
- Immutable Operations: does not modify the original data source.

## Intermediate Operations
- Used to transform or filter data.
- These operations are lazy and return a stream.
  + **`filter()`**: filters elements based on a condition. 
  + **`map()`**: transforms each element using a function. 
  + **`sorted()`**: sorts elements in natural or custom order. 
## Terminal Operations
- Trigger the processing and return a non-stream result.
  + **`forEach()`**: iterates over elements.
  + **`collect()`**: gathers results into a collection . 
  + **`reduce()`**: reduces elements to single value. 
## Short-Circuiting
- Terminate the stream early for efficiency
  + **`limit()`**: limits the number of elements. 
  + **`findFirst()`**: returns the first element.
  + **`sorted()`**: . 

## Collectors
## Statistics

## **So Sánh `Stream` vs `for-loop`**
| Tính năng             | Stream API           | For-loop          |
|----------------------|---------------------|------------------|
| Code ngắn gọn        | ✅                   | ❌                |
| Dễ đọc               | ✅                   | ❌                |
| Tận dụng đa luồng    | ✅                   | ❌                |
| Hiệu suất            | Cao với Parallel Stream | Tùy thuộc vào tối ưu hóa |
| Dễ debug            | ❌                   | ✅                |

📌 **Dùng `for-loop` nếu cần debug dễ dàng**.  
📌 **Dùng `Stream API` khi cần code ngắn gọn, dễ đọc, hiệu suất cao.**