BÁO CÁO BÀI TẬP LỚN MÔN LẬP TRÌNH WEB
HỌC KÌ I NĂM HỌC 2018 - 2019

Nhóm: 9

Thành viên
1. Nguyễn Đình Dũng - B15DCCN149
2. Tô Ngọc Hiếu - B15DCCN215
3. Bùi Văn Tụ - B15DCCN

Nội dung
1. Giới thiệu sơ lược chủ đề <br/>
a. Mục tiêu:<br/>
Xây dựng 1 trang web thương mại điện tử qua mạng Internet. Hệ thống có các tính năng trưng bày sản phẩm, lọc sản phẩm theo tên, giao dịch và thanh toán, xuất hóa đơn dưới dạng html và pdf, bình luận và đánh giá sản phẩm qua Facebook, đăng kí và đăng nhập, các chức năng quản lý phía quản trị viên.<br/>
b. Kết quả đã đạt được<br/>
Hệ thống có đầy đủ các tính năng được liệt kê ở trên.<br/>
Hệ thống được thiết kế theo mô hình MVC.<br/>
Hệ thống áp dụng các công nghệ mới như Java 8, Java EE 7..<br/>
c. Hạn chế, hướng phát triển<br/>

2. Phân công công việc<br/>
STT - Họ tên - Các nội dung thực hiện<br/>                          
1      - Dũng   - Thiết kế database, Giao diện quản trị (giỏ hàng, thư mục phân loại hàng hóa, trang chủ, đăng nhập)<br/>
2      - Tụ     - Giao diện người dùng (giỏ hàng, trang chủ, đăng nhập, sản phẩm, đăng kí, xem chi tiết hàng hóa)<br/>
3      - Hiếu   - Viết servlet (các lớp điều khiển cho quản trị viên)<br/>
4      - Dũng  - Viết servlet (các lớp điều khiển cho người dùng, xác thực, xác minh thẩm quyền và chống DoS, thanh toán, xuất báo cáo HTML, PDF)<br/>
5      - Dũng  - Truy nhập CSDL (danh mục, đặt hàng, sản phẩm, người dùng,..)<br/>
6      - Tụ     - Thêm CSS cho các file HTML<br/>
7      - Tụ     - Thêm JavaScript cho các file HTML<br/>

3. Quá trình thực hiện<br/>
Phiên bản - Chức năng - Kĩ thuật/nội dung lí thuyết đã ứng dụng                - Thời gian <br/>
1.0       - mục 1b    - Sử dụng thư viện JQuery (viết tương tác, xử lý AJAX)   - 4 tháng  <br/>
                      - CSS layout kiểu flex                                             <br/>
                      - Hệ thống sử dụng mô hình MVC                                       <br/>
                      - Công nghệ JSP/Servlet/Java 8<br/>
                      - Sử dụng Tomcat server (version 9),  hệ quản trị CSDL MySQL<br/>
                      - Sử dụng 1 số thư viện như: Jstl 1.2, Mysql jdbc, IText, Simple Json<br/>
4. Một số vấn đề gặp phải<br/>
- Định dạng văn bản UTF-8 bị lỗi (Xong)<br/>
 => Khi lập trình HTML và Servlet phải gửi/nhận dữ liệu theo định dạng UTF-8, cài đặt Eclipse đọc và dịch theo dạng UTF-8<br/>
- Vấn đề đường dẫn tương đối tuyệt đối (Xong)<br/>
- Vấn đề lỗi font khi xuất ra file PDF (Xong)<br/>
 => Thêm và sử dụng một font chữ hỗ trợ tiếng Việt<br/>
- Vấn đề thiết kế filter lọc request xấu (DosFilter - Xong)<br/>
 => Tham khảo ý tưởng từ một số thư viện nổi tiếng rồi tự viết một filter đơn giản theo ý mình<br/>
- Vấn đề khi làm việc với Facebook (Xong)<br/>
 => Xử lý token, quyền, cài đặt ứng dụng để hỗ trợ theo nhu cầu phát triển.<br/>
- Thiết kế code dễ quản lý, bảo trì, tên gợi nhớ.. (Xong)<br/>
 => Tham khảo code từ các project đã làm, từ các bài viết, code được chia sẻ trên mạng.. để thiết kế code theo chủ đề của mình và độ lớn của project.<br/>
 ...
 
