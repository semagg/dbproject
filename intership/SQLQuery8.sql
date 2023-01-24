alter table TBL_Adres
add constraint FKAdresNo foreign key(Adres_No) references TBL_Yayinevi(Adres_No)
alter table TBL_Adres
add constraint FKAdresNo foreign key(Adres_No) references TBL_Uye(Adres_No)
alter table TBL_Adres
add constraint FKAdresNo foreign key(Adres_No) references TBL_Kutuphane(Adres_No)

alter table TBL_Kutuphane
add constraint FKKutuphaneNo foreign key(Kutuphane_No) references TBL_Emanet(Kutuphane_No)
alter table TBL_Kutuphane
add constraint FKKutuphaneNo foreign key(Kutuphane_No) references TBL_Kutuphane_Kitap(Kutuphane_No)
alter table TBL_Yazar
add constraint FKkitapYazari foreign key(Yazar_No) references TBL_Kitap_Yazari(Yazar_No)
alter table TBL_Kitap
add constraint FKkitapno foreign key(Kitap_No) references TBL_Kitap_Yazari(Kitap_No)

alter table TBL_Yayinevi
add constraint FKYayinevi foreign key(Yayinevi_No) references TBL_Kitap(Yayinevi_No)
alter table TBL_Kategori
add constraint FKKategori foreign key(Kategori_No) references TBL_Kitap_Kategori(Kategori_No)
alter table TBL_Kitap
add constraint FKKitapNo foreign key(Kitap_No) references TBL_Kitap_Kategori(Kitap_No)
alter table TBL_Emanet
add constraint FKUyeNo foreign key(Uye_No) references TBL_Uye(Uye_No)
alter table TBL_Emanet
add constraint FKKitapNo foreign key(Kitap_No) references TBL_Kitap(Kitap_No)
