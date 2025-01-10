Nguyễn Minh Hoàng - BIT220063 - 22SE1

Bài tập 2 của môn Kiểm thử phần mềm

Đề bài: kiểm thử bài toán Palindrome với JUnit.

## Mô Tả
Dự án này kiểm tra một thuật toán kiểm tra Palindrome thông qua các bài kiểm thử nâng cao với **JUnit 5**. Thuật toán được sử dụng để xác định liệu một chuỗi có phải là Palindrome hay không, với các trường hợp đặc biệt như khoảng trắng, chữ hoa/chữ thường, chuỗi rỗng, và chuỗi `null`.

## Yêu cầu trước khi sử dụng
- Java Development Kit (JDK) 8 hoặc mới hơn.
- Công cụ build Maven.
- JUnit 5 để kiểm thử.

## Cài đặt
Clone repository

    git clone https://github.com/minhoangg0712/JUnit-testing.git
    cd Palindrome
Xây dựng dự án bằng Maven

    mvn clean install


## Cấu Trúc

    ├── src
    │   ├── main
    │   │   └── java
    │   │       └── StringUtils.java
    │   └── test
    │       └── java
    │           └── StringUtilsTest.java
    ├── pom.xml
    └── README.md

- **`StringUtils`**: Chứa hàm kiểm tra Palindrome.
- **`StringUtilsTest`**: Tệp kiểm thử chứa các trường hợp kiểm thử với JUnit.

## Thuật Toán

Hàm kiểm tra Palindrome nằm trong lớp `StringUtils` và có các bước chính:

- Xử lý chuỗi: 

    Loại bỏ khoảng trắng.

    Chuyển đổi toàn bộ ký tự sang chữ thường.

- Sử dụng chỉ số hai con trỏ (`left`, `right`) để so sánh ký tự từ hai phía.

- Nếu tất cả các ký tự tương ứng khớp nhau, chuỗi là Palindrome.

## Kết quả kiểm thử

| **Đầu vào**                  | **Đầu ra** | **Mô tả**                                                                                                                                  |
|-------------------------------|------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| `"radar"`                    | `true`     | Chuỗi Palindrome thông thường.                                                                                                            |
| `"hello"`                    | `false`    | Không phải Palindrome.                                                                                                                    |
| `""`                         | `true`     | Chuỗi rỗng được xem là Palindrome.                                                                                                        |
| `null`                       | `false`    | Chuỗi `null` không phải là Palindrome.                                                                                                    |
| `"A man a plan a canal Panama"` | `true`     | Palindrome khi loại bỏ khoảng trắng và chuẩn hóa chữ thường.                                                                                                                                                             |
| `"12321"`                    | `true`     | Palindrome gồm các ký tự số.                                                                                                              |
| `"12345"`                    | `false`    | Không phải Palindrome.                                                                                                                    |
| `"A@b@A"`                    | `true`     | Palindrome khi bỏ qua các ký tự đặc biệt.                                                                                                 |
| `"A!bc@d"`                   | `false`    | Không phải Palindrome.        


## Hình ảnh kết quả
![Screenshot (168)](https://github.com/user-attachments/assets/d4950b81-090c-4127-bbf1-a872ca022019)

## Mức độ bao phủ **`Test Coverage`**
- Class: 100% (1/1)
- Method: 100% (1/1)
- Line: 100% (10/10)
- Branch: 100% (6/6)

## Hình ảnh kết quả mức độ bao phủ
![Screenshot (171)](https://github.com/user-attachments/assets/b30ce055-56e5-40e5-a7ab-67b66539ba6d)

## Tài liệu tham khảo  https://chatgpt.com/c/67807545-1ebc-8000-9aab-1c02be6ab2a8
