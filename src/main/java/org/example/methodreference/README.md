# Method Reference
Java 8


| Loại Method Reference                               | Cú pháp                    | Ví dụ                 |
|----------------------------------------------------|----------------------------|-----------------------|
| **Tham chiếu đến phương thức tĩnh**               | `ClassName::staticMethod`  | `Math::abs`          |
| **Tham chiếu đến phương thức của đối tượng cụ thể** | `instance::method`         | `System.out::println` |
| **Tham chiếu đến phương thức của một đối tượng bất kỳ thuộc một lớp** | `ClassName::instanceMethod` | `String::toUpperCase` |
| **Tham chiếu đến Constructor**                    | `ClassName::new`           | `ArrayList::new`     |
