class Solution {
    private Set<String> supSet;
    private int[] status;
    private final int UNVISITED = 0, EXPLORING = 1, DONE = 2;
    private List<String> result;
    private List<List<String>> ingredients;
    private Map<String, Integer> recipeMap;
    private String[] recipes;
    
    private boolean DFS(int index) {
        if (status[index] == EXPLORING)
            return false;
        if (status[index] == DONE)
            return true;
        
        status[index] = EXPLORING;
        
        for (String ing : ingredients.get(index)) {
            if (supSet.contains(ing)) 
                continue;
            
            if (!recipeMap.containsKey(ing))
                return false;
            
            if(!DFS(recipeMap.get(ing))) {
                return false;
            }
        }
        result.add(recipes[index]);
        status[index] = DONE;
        return true;
    }
    
    public List<String> findAllRecipes
        (String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int N = supplies.length;
        this.status = new int[recipes.length];
        this.supSet = new HashSet<>();
        this.result = new ArrayList<>();
        this.ingredients = ingredients;
        this.recipeMap = new HashMap<>();
        this.recipes = recipes;
        
        for (int i = 0; i < N; i++) 
            supSet.add(supplies[i]);
        for (int i = 0; i < recipes.length; i++) 
            recipeMap.put(recipes[i], i);
        
        for (int i = 0; i < recipes.length; i++) {
            if (status[i] == UNVISITED)
                DFS(i);
            
        }
        return result;
    }
}