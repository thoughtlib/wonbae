package util;

import lombok.Getter;

@Getter
public class CodeInfo {
    public static class ErrorCode {
        public static final int OK = 0;
        public static final int DUPLICATE_VALUE = 100;
        public static final int DUPLICATE_ID = 101;
        public static final int LEAVE_ID = 102;
        public static final int DUPLICATE_BIZNUM = 103;
        public static final int OVER_FILE_SIZE = 104;
        public static final int EMPTY_PARAMETER = 110;
        public static final int EMPTY_VALUE = 120;
        public static final int EMPTY_MILEAGE = 121;
        public static final int WRONG_VALUE = 130;
        public static final int WRONG_PASSWORD = 131;
        public static final int SAME_PASSWORD = 132;
        public static final int WAITING_USER = 201;                 // 승인대기회원
        public static final int REJECT_USER = 202;                  // 승인반려회원
        public static final int STOP_USER = 203;                    // 계정정지회원
        public static final int LEAVE_USER = 204;                   // 계정탈퇴회원
        public static final int JSON_PARSE_ERR = 301;               // JSON구조 안맞음
        public static final int FILE_COUNT_DIFFERENT = 302;         // 파일 개수와 정보가 안맞음
        public static final int UNAUTHORIZED = 401;                 // 인증실패 에러
        public static final int SEND_MSG_FAIL = 201;                // 문자 전송 실패
        public static final int SEND_EMAIL_FAIL = 202;               // 이메일 전송 실패
        public static final int SEND_KAKAO_ALLIM_FAIL = 203;         // 알림톡 전송 실패
        public static final int SEND_KAKAO_FRIEND_FAIL = 203;         // 친구톡 전송 실패
        public static final int EXCEED_RECEIVER = 503;               // 수신자수 초과
    }

    /**
     * 응답결과
     */
    public static class ResponseMessage {
        public static final String OK = "성공";
        public static final String DUPLICATE_VALUE = "내용 중복";
        public static final String DUPLICATE_ID = "아이디 중복";
        public static final String LEAVE_ID = "탈퇴한 아이디";
        public static final String DUPLICATE_BIZNUM = "사업자번호 중복";
        public static final String OVER_FILE_SIZE = "개당 파일 사이즈 초과";
        public static final String EMPTY_PARAMETER = "파라미터 없음";
        public static final String EMPTY_VALUE = "DB 데이터 없음";
        public static final String EMPTY_MILEAGE = "마일리지 부족";
        public static final String WRONG_VALUE = "내용(정보) 틀림";
        public static final String WRONG_PASSWORD = "비밀번호 틀림";
        public static final String SAME_PASSWORD = "동일한 비밀번호";
        public static final String WAITING_USER = "승인대기";
        public static final String REJECT_USER = "승인반려";
        public static final String STOP_USER = "계정정지";
        public static final String LEAVE_USER = "계정탈퇴";
        public static final String JSON_PARSE_ERR = "JSON파싱 에러";
        public static final String FILE_COUNT_DIFFERENT = "파일개수 안맞음";
        public static final String UNAUTHORIZED = "인증실패 에러";
        public static final String SEND_MSG_FAIL = "문자 전송 실패";
        public static final String SEND_EMAIL_FAIL = "이메일 전송 실패";
        public static final String SEND_KAKAO_ALLIM_FAIL = "알림톡 전송 실패";
        public static final String SEND_KAKAO_FRIEND_FAIL = "친구톡 전송 실패";
        public static final String EXCEED_RECEIVER = "수신자수 초과";
        public static final String WRONG_TOKEN = "잘못 된 토큰정보 입니다.";
        public static final String WRONG_CAPTCHA = "reCAPTCHA 인증에 실패 하였습니다.";
        public static final String WRONG_AUTHORITY = "권한이 없습니다.";
    }

    /**
     * 권한구분
     */
    public static class UserAuthority {
        public static final String ADMIN = "ADMIN";
        public static final String NORMAL = "NORMAL";
    }

}