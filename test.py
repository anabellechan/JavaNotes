from collections import deque,defaultdict
a=[0,1,1]
b=[1,2,3]

def solution(A, B):
    n=len(A)
    adj_graph= defaultdict(list)
    for i in range(n):
        adj_graph[A[i]].append(B[i])
        adj_graph[B[i]].append(A[i])
        print(adj_graph)
    
    def make_graph(v):
        adj_graph.clear()
        for i in range(v):
            adj_graph[i]=[]
    
    def add_edge(u,v):
        adj_graph[u].append(v)
        adj_graph[v].append(u)

    # for u,v in zip(A,B):
    #     adj_graph[u].append(v)
    #     adj_graph[v].append(u)

    def dfs(node,visited,V):
        visited[node]=True
        val=1
        for neighbour in adj_graph[node]:
            if not visited[neighbour]:
                val+=dfs(neighbour,visited,V)
        V[node]=val
        return val
    
    def solve(n,edges):
        make_graph(n+1)
        for edge in edges:
            add_edge(edge[0],edge[1])
        V=[0]* (n+1)
        visited=[False]*(n+1)
        q=deque([0])
        visited[0]=True

        ans=0
        while q:
            node=q.popleft()
            for neighbour in adj_graph[node]:
                if not visited[neighbour]:
                    ans+=(V[neighbour]-1)//5+1
                    q.append(neighbour)
                    visited[neighbour]=True
        return ans
    edges=list(zip(A,B))
    print("Hello,",solve(n,edges))

print(solution(a,b))
    
