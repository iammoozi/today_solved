class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 쿼리 수만큼 결과 배열 생성
        int[] result = new int[queries.length];
        
        int idx = 0; // 결과 배열의 인덱스를 관리할 변수
        for (int[] query : queries) {
            // 쿼리에서 시작 인덱스, 끝 인덱스, 기준 값 추출
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            // 초기 최소 값을 최대 정수 값으로 설정
            int minNum = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                // 현재 값이 k보다 크고, 현재 최소 값보다 작으면 갱신
                if (arr[i] > k && arr[i] < minNum) {
                    minNum = arr[i];
                }
            }
            // 최소 값이 갱신되었으면 결과 배열에 저장, 아니면 -1 저장
            if (minNum < Integer.MAX_VALUE)
                result[idx++] = minNum;
            else
                result[idx++] = -1;
        }
        return result; // 결과 배열 반환
    }
}