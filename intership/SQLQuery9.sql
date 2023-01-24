
insert into TBL_Kategori values('Roman')


UPDATE TBL_Kategori set Kategori='Masal' WHERE Kategori='Roman'


 ---ÝSTEDÝÐÝMÝZ VERÝNÝN SÝLÝNMESÝNÝ ÖNLEMEK

create trigger sakinsilme --trigger
on dbo.TBL_Yazar
for delete
as 
begin
print('silemezsin')
rollback transaction
return
end

create trigger ekle 
on urunler 
for insert 
as
insert into ekleyen values('Ahmet')

create procedure harfbul @harfbul varchar(20)----procedure
as
select * from TBL_Adres where Sokak like '%'+@harfbul+'%'

CREATE VIEW Kategoribul
AS
SELECT * FROM TBL_Kategori WHERE Kategori='Roman'

DECLARE @Yazar_No INT
DECLARE @Kitap_No INT

DECLARE CRS_Yazar CURSOR FOR----cursor
SELECT Yazar_No,Yazar_Adi FROM TBL_Yazar 

OPEN CRS_Yazar

FETCH NEXT FROM CRS_Yazar INTO @Yazar_No, @Yazar_Adi

WHILE @@FETCH_STATUS =0
	BEGIN
		SELECT A.Yazar_No, B.Kitap_No FROM TBL_Yazar A
INNER JOIN TBL_Kitap B ON B.Kitap_No= A.Yazar_No 
WHERE A.Yazar_No = @Yazar_No
		FETCH NEXT FROM CRS_Yazar INTO @Yazar_No, @Kitap_No
 	END
	CLOSE CRS_Yazar
DEALLOCATE CRS_Yazar


