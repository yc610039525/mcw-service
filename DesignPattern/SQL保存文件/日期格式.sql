SELECT
  TO_DATE('1992年02月06日','YYYY"年"MM"月"DD"日"')
FROM DUAL;

需要注意：日期格式字符串中若包含非英文和符号的其他字符时，应当
使用"（双引号）括起来，否则可能出现错误。