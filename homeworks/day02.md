# Day 02

## Phần A

1. Nhập vào 03 số nguyên. Sau đó in tổng của 03 số đó theo định dạng như sau: "Tong cua 03 so nguyen a, b, c la: "
2. Nhập vào 03 số nguyên. Sau đó in trung bình cộng của 03 số đó theo định dạng như sau: "TBC cua 03 so nguyen a, b, c la: "
3. Nhập vào bán kính của hình tròn. Sau đó tính chu vi và diện tích. Biết Pi = 3.14
4. Nhập vào hai cạnh a, b và đường cao h. Sau đó tính diện tích hình bình hành. Gợi ý: S = (a+b)\*h/2).
5. Nhập vào 3 cạnh của hình hộp chữ nhật, Sau đó tính thể tích của nó.
6. Nhập vào đơn giá của 1 sản phẩm và số lượng của sản phẩm đó. Sau đó tính số tiền khách phải trả, biết rằng cửa hàng đang giảm giá 10%.
7. Nhập vào 02 số nguyên. Sau đó hoán chuyển giá trị 02 số đó rồi in ra màn hình (theo 02 cách: dùng biến tạm trung gian và không dùng biến tạm trung gian).

## Phần B

### 1. Nhập vào một số gọi là điểm trung bình của 1 học sinh

Sau đó in ra màn hình xếp loại học tập của học sinh đó theo quy tắc sau:

```text
  > = 9.0 là XUẤT SẮC
  9 < điểm <= 8 là GIỎI
  8 < điểm <= 6.5 là KHÁ
  6.5 < điểm <= 5.0 là TRUNG BÌNH
  còn lại là YẾU

```

Gợi ý: Dùng các phép toán so sánh, phép toán logic.

### 2. Nhập vào một số gọi là tháng trong năm

```text
Sau đó in ra màn hình tên tháng đó theo quy tắc:
1, 2, 3: XUAN
4, 5, 6: HA
7, 8, 9: THU
10, 11, 12: DONG
Dùng 02 cách: if-else if và switch
```

### 3.1. Nhập vào từ bàn phím 1 số nguyên dương n, sau đó in ra từ 1 đến n có bao nhiêu số chia hết cho 3

### 3.2. Hay in ra 10 so nguyen duong dau tien chia het cho 5

### 4. Yêu cầu người dùng nhập vào 1 số lẻ, nếu không đúng thì nhập lại

### 5.1. Cải tiến bài 1, yêu cầu người dùng nhập dùng yêu cầu: DIEM phải từ 0 đến 10 (dùng do ..while)

### 5.2. Cải tiến bài 2, yêu cầu người dùng nhập dùng yêu cầu: THANG phải từ 1 đến 12 (dùng do ..while)

### 6.1. Nhập từ bàn phím một số nguyên dương, sau đó in ra màn hình số đó có phải là số nguyên tố hay không?

### 6.2. In ra các số nguyên tố nhỏ hơn 100

- Gợi ý: Số nguyên tố là số tự nhiên lớn hơn 1 chỉ chia hết cho 1 và chính nó.
- Xem thêm: <http://vi.wikipedia.org/wiki/S%E1%BB%91_nguy%C3%AAn_t%E1%BB%91>

### 7. Hãy nhập vào một số nguyên dương và sau đó xác định só đó có phải là số hoàn hảo hay ko?

- Ghi chú: Số hoàn hảo (perfect number) là số có tổng các ước số nhỏ hơn hoặc bằng nó.
- Tham khảo: <http://vi.wikipedia.org/wiki/S%E1%BB%91_ho%C3%A0n_thi%E1%BB%87n/>

## Phần C

Viết 1 class có tên là PhanSo để biểu diễn số phân số. Class này có các thuộc tính và phương thức sau:

- Thuộc tính:
  - Tử số (numerator / TuSo)
  - Mẫu số (denominator / MauSo)
- Phương thức:

  - Hàm khởi tạo (constructor) có 2 tham số truyền vào là tử số và mẫu số
  - Hàm in ra màn hình phân số dưới dạng: TuSo / MauSo
  - Hàm rút gọn phân số: vd: 2/4 -> 1/2

    ```text

    Gợi ý: Dùng thuật toán Euclid:
    Tìm ước chung lớn nhất của tử số và mẫu số
    Chia tử số và mẫu số cho ước chung lớn nhất đó

    ```

  - Hàm cộng 2 phân số: vd: 1/2 + 1/3 = 5/6
  - Hàm trừ 2 phân số: vd: 1/2 - 1/3 = 1/6
  - Hàm nhân 2 phân số: vd: 1/2 x 1/3 = 1/6
  - Hàm chia 2 phân số: vd: 1/2 / 1/3 = 3/2
  - Hàm so sánh 2 phân số: vd: 1/2 > 1/3 = true

  ```text
  Gợi ý: So sánh 2 phân số a/b và c/d
  a/b > c/d <=> a*d > b*c
  ```

## Phần D: Cài đặt Encapsulation cho class PhanSo
