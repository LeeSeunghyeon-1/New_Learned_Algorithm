while True:
    try:
        a, b = map(int, input().split())
        print(a+b)
    except:
        break
'''
- 몇 번 반복할 것인지 정해지지 않은 문제임.
- 예외 처리를 사용해야 함.
- try / except 란 ?
    try: 
        실행할 코드
    except:
        예외가 발생했을 때 처리하는 코드
'''
