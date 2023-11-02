import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
* 	걸린 시간 : 5분
    시간복잡도 : O(2n) = O(n)
* */
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		int[] arr = new int[N];

		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
    
		Arrays.sort(arr); //투포인터 활용을 위한 정렬
                      //정렬을 해야 오른쪽 포인터가 오른쪽으로 가면 차이가 커짐이 보장됨
                      //반대로 왼쪽 포인터가 오른쪽으로가면 차이가 작아짐이 보장됨
		int l=0,r=0;
		long min_differ = 10_000_000_001L;

    //오른쪽 포인터가 오른쪽 바깥으로 나갔을 때 까지
		while(r < arr.length){
			long differ = arr[r] - arr[l];

      //M보다 크거나 같고 현재 차이가 최소 차이가 작으면 최소값 최신화
			if(differ >= M && min_differ > differ ){
				min_differ = differ;
			}
      //차이가 M보다 크면 l~r 사이에 더 작은 차이가 있을 수 있으므로 차이를 줄여보기 위해 왼쪽 포인터 증가
			if(differ > M){
				l++;
			}
      //차이가 M보다 작거나 같으면 l~r사이에 더이상 작은 차이가 없으므로 차이를 늘리기 위해 오른쪽 포인터 증가
      else {
				r++;
		  }
		}

		System.out.println(min_differ);
	}
}
