package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 -> 공백 사용 불가
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 카멜 케이스로 사용
        // 6. 예약어 사용 불가

        // 입국 신고서
        String nationality = "대한민국"; // 국적
        String firstName = "수원"; // 이름
        String lastName = "채"; // 성
        String dateofBirth = "1997-08-18"; // 생일
        String residentialAddress = "신라 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국 목적
        String flightNo = "No10"; // 항공 편명
        String _flightNo = "No11"; // 밑줄 시작
        String _flight_no_2 = "No11"; // 밑줄 시작
    }
}
