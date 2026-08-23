import csv

data = [
    ["姓名", "年齡", "城市"],
    ["小明", 17, "宜蘭"],
    ["小美", 18, "高雄"]
]

with open("people.csv", "w", newline="", encoding="utf-8-sig") as f:
    writer = csv.writer(f)
    writer.writerows(data)