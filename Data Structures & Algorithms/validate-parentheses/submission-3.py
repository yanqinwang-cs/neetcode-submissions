class Solution:
    def isValid(self, s: str) -> bool:
        match = {')' :'(', ']': '[', '}': '{'}
        stack = []
        opens = set(match.values())
        for ch in s:
            if ch in opens:
                stack.append(ch)
            elif ch in match:
                if not stack or stack[-1] != match[ch]:
                    return False
                stack.pop()
        return not stack
        