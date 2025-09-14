#include <stdio.h>
#include <conio.h>
#define MAX 3
void bfs(int graph[][MAX], int visited[], int start)
{
    int queue[MAX], rear = -1, front = -1, i, k;
    for (k = 0; k < MAX; k++)
        visited[k] = 0;

    queue[++rear] = start; // insert first node to queue
    ++front;
    visited[start] = 1;

    while (rear >= front) // queue is empty
    {
        start = queue[front++];
        printf("%c-", start + 65);

        for (i = 0; i < MAX; i++) // add neighbours
        {
            if (graph[start][i] && visited[i] == 0)
            {
                queue[++rear] = i;
                visited[i] = 1;
            }
        }
    }
}
void main()
{
    int visited[MAX] = {0};
    int graph[MAX][MAX], i, j;
    printf("Enter values in graph\n");
    for (i = 0; i < MAX; i++)
        for (j = 0; j < MAX; j++)
            scanf("%d", &graph[i][j]);
    printf("Grapg is represented as:\n");

    for (i = 0; i < MAX; i++)
    {
        for (j = 0; j < MAX; j++)
            printf("%d", graph[i][j]);
        printf("\n");
    }
    printf("After Breadth first search\n");
    bfs(graph, visited, 0);
    getch();
}
