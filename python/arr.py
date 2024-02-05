# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.
# arr, low, high
low = [0,2]
high = [2,4]
arr = [1,2,2,3,4]
result = []
cnt = 0
for i in range(0,len(low)):
    for j in range(0,len(arr)):
        if(arr[j]>=low[i] and arr[j]<=high[i]):
            cnt+=1
    result.append(cnt)
    cnt=0;
print(result)

# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    print_hi('PyCharm')

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
