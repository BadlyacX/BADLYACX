import csv

with open("people.csv", "r", encoding="utf-8-sig") as f:
    reader = csv.DictReader(f)
    for row in reader:
        print(row["姓名"], row["年齡"], row["城市"])