-- 코드를 입력하세요
# 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요.
# 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬
SELECT
P.PRODUCT_ID,
P.PRODUCT_NAME,
sum(P.PRICE*O.AMOUNT) as TOTAL_SALES
from
FOOD_PRODUCT P
join
FOOD_ORDER O
on P.PRODUCT_ID = O.PRODUCT_ID
where O.PRODUCE_DATE like '2022-05%'
group by P.PRODUCT_ID, P.PRODUCT_NAME
order by TOTAL_SALES desc,
O.PRODUCT_ID asc
;
