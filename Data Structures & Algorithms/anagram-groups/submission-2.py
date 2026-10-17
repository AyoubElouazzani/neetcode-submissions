class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = defaultdict(list)
        for word in strs :
            # Sort the word → use it as a key
            key = ''.join(sorted(word))
            anagrams[key].append(word)

        return list(anagrams.values())
            


