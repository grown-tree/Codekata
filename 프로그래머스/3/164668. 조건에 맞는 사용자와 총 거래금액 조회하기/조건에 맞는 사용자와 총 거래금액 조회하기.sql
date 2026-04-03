# 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회
# 총거래금액을 기준으로 오름차순 정렬
SELECT
U.USER_ID,
U.NICKNAME,
sum(PRICE) as TOTAL_SALES
from
USED_GOODS_BOARD B
join
USED_GOODS_USER U
on B.WRITER_ID = U.USER_ID
where
B.STATUS = 'DONE'
group by U.USER_ID
having TOTAL_SALES >= 700000
order by TOTAL_SALES asc
;