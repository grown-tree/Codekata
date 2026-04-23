-- 코드를 입력하세요
# 상반기 주문 정보를 담은 FIRST_HALF 기본 키는 FLAVOR
# ICECREAM_INFO의 기본 키는 FLAVOR

# 상반기 아이스크림 총주문량이 3,000보다 높으면서
# 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문
SELECT
I.FLAVOR
from
FIRST_HALF F
join
ICECREAM_INFO I
on F.FLAVOR = I.FLAVOR
where F.TOTAL_ORDER >3000 and
I.INGREDIENT_TYPE = "fruit_based"
order by F.TOTAL_ORDER desc;