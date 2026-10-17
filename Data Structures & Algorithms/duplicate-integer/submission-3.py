class Solution:
    # def hasDuplicate(self, nums: List[int]) -> bool:
    #     LenNums = len(nums)
    #     MYset = set(nums)
    #     if len(MYset) == LenNums:
    #         return False
    #     return True 

    def hasDuplicate(self, nums: List[int]) -> bool:
        myset = set()
        for num in nums:
            if num in myset:
                return True
            myset.add(num)
        return False

            
