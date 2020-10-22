def latest(scores):
    return scores[-1]


def personal_best(scores):
    return max(scores)


# def personal_top_three(scores):
#     top_three = []
#     try:
#         for _ in range(3):
#             top_score = max(scores)
#             top_three.append(top_score)
#             scores.remove(top_score)
#         return top_three
#     except:
#         return top_three

def personal_top_three(scores):
    scores = sorted(scores, reverse=True)
    return scores[:3]

#bubble sort
# def personal_top_three(scores):
#     length = len(scores)
#     for _ in range(length-1):
#         for i in range(length-1):
#             if scores[i] < scores[i+1]:
#                 temp = scores[i]
#                 scores[i] = scores[i+1]
#                 scores[i+1] = temp
#     if length > 3:
#         return scores[0:3]
#     else:
#         return scores