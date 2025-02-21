# Singleton Pattern là gì?

Singleton Pattern đảm bảo rằng một class chỉ có duy nhất một instance và cung cấp một cách để truy cập instance đó từ bất kỳ đâu trong chương trình.

📌 Ứng dụng thực tế:

- Quản lý kết nối Database (VD: DBConnection).
- Tạo Logger (VD: Logger.getInstance()).
- Quản lý cấu hình hệ thống (VD: AppConfig).

## Cách triển khai Singleton Pattern trong Java
### Eager Initialization
✅ Ưu điểm:
- Đơn giản, dễ triển khai.
- Không cần xử lý đồng bộ (Thread-safe).

❌ Nhược điểm:
- Tốn bộ nhớ nếu instance được tạo nhưng không sử dụng.

## Lazy Initialization (chỉ tạo khi cần)
✅ Ưu điểm:
- Chỉ tạo instance khi thực sự cần → tiết kiệm bộ nhớ.

❌ Nhược điểm:
- Không thread-safe → nếu nhiều thread gọi getInstance() cùng lúc, có thể tạo nhiều instance.

## Thread-safe Singleton (dùng synchronized)
✅ Ưu điểm:
- Thread-safe → chỉ có một thread có thể tạo instance.

❌ Nhược điểm:
- synchronized làm chậm hiệu suất khi gọi getInstance().

## Double-Checked Locking (tối ưu thread-safe)
✅ Ưu điểm:
- Thread-safe và hiệu suất cao vì chỉ dùng synchronized khi instance == null.

❌ Nhược điểm:
- Hơi phức tạp so với cách khác.

### volatile là gì?
- volatile là một từ khóa (modifier) trong Java được sử dụng để đảm bảo rằng:
  + Dữ liệu được cập nhật ngay lập tức trên tất cả các thread.
  + Tránh lỗi "instruction reordering" (sắp xếp lại lệnh) của trình biên dịch hoặc CPU.
  + Đồng bộ hóa bộ nhớ giữa các thread, đảm bảo một thread luôn thấy giá trị mới nhất của biến.

## Enum Singleton (Cách tốt nhất trong Java)
✅ Ưu điểm:
- Thread-safe 100%.
- Không bị phá vỡ bởi Reflection hoặc Serialization.

❌ Nhược điểm:
- Không thể lazy initialization.

## Khi nào dùng cách nào?
- Eager Initialization → Khi luôn cần instance và không lo tốn bộ nhớ.
- Lazy Initialization → Khi chỉ muốn tạo khi cần, nhưng không dùng trong môi trường đa luồng.
- Thread-safe (synchronized) → Khi cần đảm bảo chỉ có 1 instance, nhưng hiệu suất không quan trọng.
- Double-Checked Locking → Khi cần thread-safe nhưng muốn tối ưu hiệu suất.
- Enum Singleton → Khi cần cách triển khai đơn giản, bảo mật, mạnh mẽ nhất.
