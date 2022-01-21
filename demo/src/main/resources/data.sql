INSERT INTO PRODUCT (product_Id, Gender,Category,Sub_Category,Product_Type,Colour,Use,Product_Title,ImageURL )
SELECT productId, Gender,Category,SubCategory,ProductType,Colour,Usage,ProductTitle,ImageURL FROM CSVREAD('C:\Users\LENOVO\Downloads\fashion_pro.csv')
FETCH FIRST 50 ROWS ONLY;
