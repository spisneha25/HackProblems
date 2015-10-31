/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution 
{
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) 
    {
        UndirectedGraphNode root = null;
        
        if(node == null)
            return root;
            
        root = cloningGraph(node);
        
        return root;
    }
    
    public UndirectedGraphNode cloningGraph(UndirectedGraphNode noder)
    {
        Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        q.add(noder);
        hm.put(noder, new UndirectedGraphNode(noder.label));
        UndirectedGraphNode node, newn;        
        
        while(!q.isEmpty())
        {
            node = q.remove();
            newn = hm.get(node);
            
            for(UndirectedGraphNode n : node.neighbors)
            {
                if(!hm.containsKey(n))
                {
                    hm.put(n, new UndirectedGraphNode(n.label));
                    q.add(n);
                }
                
                newn.neighbors.add(hm.get(n));
            }
        }
        
        return hm.get(noder);
    }
}
