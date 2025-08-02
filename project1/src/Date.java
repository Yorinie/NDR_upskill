public class Date {
    private int year;
    private int month;
    private int day;

    // constructor
    public Date(int year, int month, int day) {
        this.year = year; // this year is from private int year = int year in date)
        this.month = month;
        this.day = day;
    }

    // setter ไส้กำหนดค่า attribute
    // getter ส่งค่าคืนกลับให้กับ object
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    // getter ไว้ตั้งค่าของattribute ออกมา ๖ ส่งค่าดลับให้object ที่เรียกใช้
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // toString() เป็น method ที่เรียกใช้ได้เลยผ่าน object
    public String toString() {
        return String.format("%02d%02d%4d", this.month, this.day, this.year);
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
