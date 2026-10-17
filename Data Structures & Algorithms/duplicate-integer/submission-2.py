class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        LenNums = len(nums)
        MYset = set(nums)
        if len(MYset) == LenNums:
            return False
        return True 

            
