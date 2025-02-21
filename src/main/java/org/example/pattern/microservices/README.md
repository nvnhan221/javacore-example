# Design Pattern for Designing and Implementing Microservices

## Gateway Pattern
Là một kiến trúc trong microservices giúp quản lý luồng request bằng cách sử dụng API Gateway là điểm vào duy nhất cho tất cả dịch vụ.

## Tính năng
- Routing: điều hướng request đến đúng microservice.
- Load Balancing: phân phối request đều giữa các instance của service.
- Authentication & Authorization: xác thực người dùng và phân quyền.
- Rate limiting: hạn chế số lượgn requet để tránh quá tải.
- Logging & monitoring: thu thập logs để giám sát hệ thống.
- Response Aggregation: tổng hợp kết quả từ nhiều service thành 1 response.

## Triển khai
- Spring Boot triển khai API Gateway với Spring Cloud Gateway. -> xem thực hành thêm.
- AWS API Gateway.

## Service Mesh
Là một lớp hạ tầng, giúp quản lý giao tiếp 